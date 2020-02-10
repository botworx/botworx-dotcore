using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler.Transpile.Policy.Trigger
{
    class TriggerPolicy : RootPolicy
    {
        public TriggerPolicy()
        {
            //
            var visitTable = new[] {
                new NodeVisitInfo(AstNodeKind.ClauseExpr, new TriggerMessageExprVisit<Transpiler, ClauseExpr>()),
                new NodeVisitInfo(AstNodeKind.Name, new TriggerNameVisit<Transpiler, Name>())
            };
            MergeVisits(visitTable);
        }
    }
}
