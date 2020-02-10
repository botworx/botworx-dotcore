using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler.Transpile.Policy.Rhs
{
    public class SnippetExprVisit<T, N> : NodeVisit<T, N>
        where T : Transpiler, INodeVisitor
        where N : AstNode
    {
        public override void DoVisit(N n)
        {
            t.Write(n.Name);
        }
    }
}
