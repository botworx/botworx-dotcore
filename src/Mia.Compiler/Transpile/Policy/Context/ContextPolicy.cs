using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler.Transpile.Policy.Context
{
    class ContextPolicy : RootPolicy
    {
        public ContextPolicy()
        {
            //
            var visitTable = new[] {
                new NodeVisitInfo(AstNodeKind.ClauseExpr, new ContextClauseExprVisit<ClauseExpr>()),
                new NodeVisitInfo(AstNodeKind.Name, new ContextNameVisit<Transpiler, Name>())
            };
            MergeVisits(visitTable);
        }
    }
}
