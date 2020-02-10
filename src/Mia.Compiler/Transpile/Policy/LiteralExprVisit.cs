using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler.Transpile.Policy
{
    public class LiteralExprVisit<T, N> : NodeVisit<T, N>
        where T : Transpiler, INodeVisitor
        where N : LiteralExpr
    {
        public override void DoVisit(N n)
        {
            t.Write(n.Value.ToString());
        }
    }
}
