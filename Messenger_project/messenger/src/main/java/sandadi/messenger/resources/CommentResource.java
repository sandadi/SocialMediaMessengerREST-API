package sandadi.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sandadi.messenger.model.Comment;
import sandadi.messenger.service.CommentService;

@Path("/")
public class CommentResource {
	CommentService cs = new CommentService();

	@GET
	public List<Comment> getAllComments(@PathParam("messageId") long messageID) {
		return cs.getAllComments(messageID);
		
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Comment addComment(Comment comment, @PathParam("messageId") long messageId) {

		return cs.addComment(messageId, comment);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{commentId}")
	public Comment updateComments(Comment comment, @PathParam("messageId") long messageId,
									@PathParam("commentId") long commentId) {
		comment.setId(commentId);
		return cs.updateComment(messageId, comment);
	}

	@DELETE
	@Path("/{commentId}")
	public void removeComment(@PathParam("messageId") long messageID, @PathParam("commentId") long commentID) {
		cs.removeComment(messageID, commentID);
	}
}
