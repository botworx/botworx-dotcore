using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Compiler.Ast;

namespace Mia.Compiler.Transpile.Policy
{
    public class SelectStmtVisit<T, N> : BlockStmtVisit<T, N>
        where T : Transpiler, INodeVisitor
        where N : SelectStmt
    {
    }
}
