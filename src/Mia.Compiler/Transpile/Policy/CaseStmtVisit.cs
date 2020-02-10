using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler.Transpile.Policy
{
    public class CaseStmtVisit<T, N> : StmtVisit<T, N>
        where T : Transpiler, INodeVisitor
        where N : CaseStmt
    {
        public override void DoVisit(N n)
        {
            t.PushLhsPolicy();
            base.DoVisit(n);
            t.PopPolicy();
        }
    }
}
