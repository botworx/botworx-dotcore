using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Mia.Compiler.Ast
{
    public class LhsCondStmt : CondStmt
    {
        //
        public LhsCondStmt()
            : base(AstNodeKind.LhsCondStmt)
        {
        }
    }
}
