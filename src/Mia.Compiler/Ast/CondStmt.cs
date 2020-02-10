using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Compiler.Ast
{
    public class CondStmt : Stmt
    {
        public CondStmt(AstNodeKind kind)
            : base(kind)
        {
        }
        public CondStmt(AstNodeKind kind, Token token)
            : base(kind, token)
        {
        }
    }
    class Precondition : LhsDef
    {
    }
}
