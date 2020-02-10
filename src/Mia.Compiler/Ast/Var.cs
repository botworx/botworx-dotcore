using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler
{
    public class Var : AstNode
    {
        public Token TypeToken;
        //
        public Var(Token token) : this(token, null)
        {
            TypeToken = TokenInstance.CSharp.ELEMENT;
        }
        public Var(Token token, Token typeToken)
            : base(AstNodeKind.Var, token)
        {
            TypeToken = typeToken;
        }
    }
}
