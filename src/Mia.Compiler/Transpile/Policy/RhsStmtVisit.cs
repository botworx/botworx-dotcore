using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler.Transpile.Policy
{
    public class RhsStmtVisit<T, N> : BlockStmtVisit<T, N>
        where T : Transpiler, INodeVisitor
        where N : RhsDef
    {
        public override void BeginVisit(N n)
        {
            t.PushRhsPolicy();
            base.BeginVisit(n);
        }
        public override void EndVisit(N n)
        {
            base.EndVisit(n);
            t.PopPolicy();
        }
    }
}
