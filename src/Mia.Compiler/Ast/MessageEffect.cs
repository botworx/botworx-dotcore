﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Mia.Runtime;

namespace Mia.Compiler.Ast
{
    public class MessageEffect : AstNode
    {
        public ExprSeq ExprSeq;
        //
        public MessageEffect()
            : base(AstNodeKind.MessageEffect)
        {
        }
        public override void Resolve()
        {
            base.Resolve();
            ExprSeq.Resolve();
        }
        public override void OnAddProperty(NodeProperty property)
        {
            string propertyName = property.Predicate;
            switch (propertyName)
            {
                case "context":
                    MessageTag.ContextToken = property.Object;
                    break;
            }
        }
    }
}
