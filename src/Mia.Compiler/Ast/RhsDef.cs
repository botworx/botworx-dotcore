using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Compiler.Ast
{
    public class RhsDef : AstNode
    {
        public RhsDef(AstNodeKind kind, Token token) : base(kind, token) { }
        public RhsDef() : base(AstNodeKind.Rhs) { }
    }
}
