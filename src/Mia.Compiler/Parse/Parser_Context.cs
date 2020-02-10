﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

using Mia.Compiler.Ast;
using Mia.Runtime;

namespace Mia.Compiler.Parse
{
    public partial class Parser
    {
        void ParseContext(AstNode parent)
        {
            Advance();//past 'context
            Token name = CurrentToken;
            RootBlock.AddEntityDef(new EntityDef(name));
            Advance();//past name
            //
            ContextDef def = new ContextDef(name);
            parent.AddChild(def);
            //
            do
            {
                CreateState(CurrentList);
                ParseContextItem(def);
                PopState();
            } while (Advance());
        }
        void ParseContextItem(ContextDef parent)
        {
            PushNode(parent);
            ExprSeq exprSeq = ParseExprSeq(ParseFlag.ParseLines);
            //parent.ExprSeq = expr;
            parent.CreateTopicDef(exprSeq);
            PopNode();
        }
   }
}