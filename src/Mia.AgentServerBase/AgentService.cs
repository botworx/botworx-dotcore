using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using System.ServiceModel;
using System.ServiceModel.Description;

using Mia.Runtime;

namespace Mia.AgentLib.ServerLib
{
    //[ServiceBehavior(InstanceContextMode = InstanceContextMode.PerSession)]
    public class AgentService : BrainService//, IAgentService
    {
        //
        public Guid GetBrain(Guid agentId)
        {
            AgentSession session = GetAgentSession(agentId);
            return session.GetBrain(agentId);
        }
    }
}
