using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using System.ServiceModel;
using System.ServiceModel.Description;

using Mia.Runtime;

namespace Mia.AgentLib.ServerLib
{
    public class BrainService : ProcessService
    {
        //
        public void Run(Guid brainId)
        {
            BrainSession session = GetBrainSession(brainId);
            session.Run(brainId);
        }
    }
}
