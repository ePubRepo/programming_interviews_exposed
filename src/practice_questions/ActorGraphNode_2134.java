package practice_questions;

import java.util.HashSet;
import java.util.Set;

public class ActorGraphNode_2134 {
  private final String actorName;
  private final Set<ActorGraphNode_2134> linkedActors;

  public ActorGraphNode_2134(String actorName) {
    this.actorName = actorName;
    linkedActors = new HashSet<ActorGraphNode_2134>();
  }

   public void linkCostar(ActorGraphNode_2134 costar) {
     linkedActors.add(costar);
     costar.linkedActors.add(this);
   }
}
