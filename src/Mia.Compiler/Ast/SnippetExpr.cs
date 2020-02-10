using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Compiler.Ast
{
    public class SnippetExpr : Expression
    {
        public SnippetExpr(Token name)
            : base(AstNodeKind.Snippet, name)
        {
        }
    }
}
