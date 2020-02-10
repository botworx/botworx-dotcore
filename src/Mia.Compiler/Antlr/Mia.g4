grammar Mia;

/*INVALID:;
COMMENT:;
NEWLINE:;
EOL:;
TERMINATOR:;
INDENT:;
OUTDENT:;
*/

DIGIT:   [0-9];
L:			 [a-zA-Z_];
VERB:    [a-z_]+[a-zA-Z0-9_]*;
NOUN:    [A-Z_]+[a-zA-Z0-9_]*;
ID:      [a-zA-Z_]+[a-zA-Z0-9_]*;
CR:      [\r?\n]+;

NUMBER: DIGIT+;
//
IMPORT: 'import';
DEF: 'def';
NOT: 'not';
RETURN: 'returnExpr';
//
WHERE: 'where';
LONGSKINNYARROW: '-->';
BANGARROW: '!->';
FATLONGARROW: '==>';
BANGFATARROW: '!=>';
//
ARROW: '->';
//
PLUS: '+';
MINUS: '-';
MINUSPLUS: '-+';
STAR: '*';
AT: '@';
SLASH: '/';
//
BANGEQ: '!=';
EQ: '=';
BANG: '!';
//
VARIABLE: '$' ID;
TYPE: NOUN ':' ;
PROPERTY: VERB ':' ;

//
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
COLONCOLON: '::';
HAT: '^';
SEMICOLON: ';';
LEFTANGLECOLON: '<:';
LEFTANGLE2COLON: '<<:';
//
COMMENT: '#'.*? -> skip;
SNIPPET: '|'.*? ;

STRING: '"' ~ ["\r\n]* '"';

NEWLINE: [\r?\n]+ ;
//WS: [\s \t]+ -> skip;
WS: [ \t]+ -> skip ;
INVALID: . ;

ignore
  : COMMENT | NEWLINE | SEMICOLON | INVALID
  ;

file
  : module EOF
    //{ return $1; }
  ;

module
  : body
    //{ $$ = new yy.module($1); }
  ;

block
  : INDENT OUTDENT
    //{ $$ = new yy.block(); }
  | INDENT body OUTDENT
    //{ $$ = $2; }
  ;

body
  : line
    //{ $$ = new yy.block($1); }
  | body TERMINATOR line
    //{$$ = $1; $1.add($3);}
  | body TERMINATOR
  ;

commalist
  :
  | expression
    //{$$ = [$1];}
  | commalist ',' expression
    //{$$ = $1; $1.push($3);}
  ;

exprlist
  :
  | expression
    //{$$ = [$1];}
  | exprlist TERMINATOR expression
    //{$$ = $1; $1.push($3);}
  | exprlist TERMINATOR
  ;

line
  : statement | expression
  ;

statement
  : importStmt | ruledef | where | returnExpr
  ;

importStmt
  : IMPORT expression
    //{ $$ = new yy.importStmt($2); }
  ;

trigger
  : parenExpr
    //{ $$ = new yy.trigger($1); }
  ;

ruledef
  : DEF trigger block
    //{ $$ = new yy.ruledef($2, $3); }
  ;

condition
  : expression
    //{$$ = new yy.condition($1);}
  ;

where
  : WHERE INDENT lhs rhs OUTDENT
    //{$$ = new yy.Query($3, $4);}
  ;

lhs
  : condition
    //{$$ = new yy.lhs($1);}
  | lhs TERMINATOR condition
    //{$$ = $1; $1.add($3);}
  | lhs TERMINATOR
  ;

rhs
  : action
    //{$$ = new yy.rhs($1);}
  | rhs TERMINATOR action
    //{$$ = $1; $1.add($3);}
  | rhs TERMINATOR
  ;

action
  : whereTrue | whereFalse | whereAllTrue | whereAllFalse
  ;

whereTrue
  : '-->' block
    //{ $$ = new yy.action($2, $1); }
  ;

whereFalse
  : '!->' block
    //{ $$ = new yy.action($2, $1); }
  ;

whereAllTrue
  : '==>' block
    //{ $$ = new yy.action($2, $1); }
  ;

whereAllFalse
  : '!=>' block
    //{ $$ = new yy.action($2, $1); }
  ;
/*
expression
  : paragraph | terminal | parenExpr | prefixExpr | postfixExpr | binaryExpr
  ;
*/
expression
  : prefixExpr
  ;

terminal
  : term | literal | snippet
  ;

verb
  : VERB
    //{ $$ = new yy.term($1); }
  ;

variableName
  : VARIABLE
  //{ $$ = $1.slice(1); }
;

variable
  : variableName
    //{ $$ = new yy.variable($1); }
  ;

term
  : variable | NOUN
    //{ $$ = new yy.term($1); }
  ;

literal
  : STRING
    //{ $$ = new yy.literal($1); }
  ;

snippet
  : SNIPPET
    //{ $$ = new yy.snippet($1); }
  ;

paragraph
: sentence
  //{$$ = $1;}
| term INDENT exprlist OUTDENT
  //{$$ = new yy.paragraph($1, $3);}
;

sentence
  : clause
    //{$$ = $1;}
  | clause ',' commalist
    //{$$ = new yy.sentence($1, $3);}
  ;

clause
  : simpleclause
    //{$$ = $1;}
  | simpleclause properties
    //{$$ = $1; $1.xtra = $2;}
  ;

simpleclause
  : expression verb expression
    //{ $$ = new yy.clause($1, $2, $3); }
  | expression verb
    //{ $$ = new yy.clause($1, $2, yy._null); }
  | verb expression
    //{ $$ = new yy.clause(yy._null, $1, $2); }
  | verb
    //{ $$ = new yy.clause(yy._null, $1, yy._null); }
  ;

typeName
  : TYPE
  //{ $$ = $1.slice(0, -1); }
;

propertyName
  : PROPERTY
  //{ $$ = $1.slice(0, -1); }
;

property
  :
  propertyName
    //{ $$ = new yy.property($1); }
  | propertyName expression
    //{ $$ = new yy.property($1, $2); }
  ;

properties
  :
    property
    //{$$ = new yy.properties($1);}
  | properties property
    //{$$ = $1; $1.add($2);}
  ;

parenExpr
  : '(' ')'
    //{ $$ = null; }
  | '(' expression ')'
    //{ $$ = $2; }
  ;

prefixExpr
  : typed | not | assertExpr | retract | modify | propose | slash
  ;

postfixExpr
  : achieve
  ;

typed
  : typeName expression
  //{ $2.type = $1 ; $$ = $2; }
  ;

not
  : NOT expression
  //{ $$ = new yy.unaryExpr($2, $1); }
  ;

assertExpr
  : '+' expression
    //{ $$ = new yy.unaryExpr($2, $1+'_'); }
  ;

retract
  : '-' expression
  //{ $$ = new yy.unaryExpr($2, $1); }
  ;

modify
  : '-+' expression
  //{ $$ = new yy.unaryExpr($2, $1); }
  ;

propose
  : '*' expression
  //{ $$ = new yy.unaryExpr($2, $1); }
  ;

achieve
  : expression '!'
  //{ $$ = new yy.unaryExpr($2, $1); }
  ;

slash
  : '/' expression
  //{ $$ = new yy.unaryExpr($2, $1); }
  ;

binaryExpr
  : contextExpr | injectExpr | typeOfExpr | bindExpr | assignExpr | notEqualExpr
  ;

contextExpr
  : expression '<:' INDENT exprlist OUTDENT
    //{ $$ = new yy.binaryExpr($1, $4, $2); }
  ;

injectExpr
  : expression '<<:' expression
    //{ $$ = new yy.binaryExpr($1, $3, $2); }
  ;

typeOfExpr
  : expression '^' expression
    //{ $$ = new yy.binaryExpr($1, $3, $2); }
  ;

assignExpr
  : expression '=' expression
    //{ $$ = new yy.binaryExpr($1, $3, $2); }
  ;

bindExpr
  : expression '->' expression
    //{ $$ = new yy.binaryExpr($1, $3, $2); }
  ;

notEqualExpr
  : expression '!=' expression
    //{ $$ = new yy.binaryExpr($1, $3, $2); }
  ;

returnExpr
  : RETURN expression
    //{ $$ = new yy.returnExpr($2); }
  | RETURN
    //{ $$ = new yy.returnExpr(null); }
  ;
