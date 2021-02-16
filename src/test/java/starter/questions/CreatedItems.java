package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.ui.blog.BlogPage;
import starter.ui.post.PostPage;

public class CreatedItems {

    public static Question<String> createdCategory(){
        return actor -> TextContent.of(BlogPage.CATEGORY_ITEM).viewedBy(actor).asString();
    }

    public static Question<String> createdPost(){
        return actor -> TextContent.of(PostPage.NEW_POST).viewedBy(actor).asString();
    }
}
