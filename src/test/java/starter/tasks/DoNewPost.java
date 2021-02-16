package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import starter.ui.post.PostPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoNewPost implements Task {

    private final String postTitle;
    private final String postBody;
    private final String seoKeywords;
    private final String seoDescription;

    public DoNewPost(String postTitle, String postBody, String seoKeywords, String seoDescription){
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.seoKeywords = seoKeywords;
        this.seoDescription = seoDescription;
    }

    public static Performable completeAllFields(String postTitle, String postBody, String seoKeywords, String seoDescription){
        return instrumented(DoNewPost.class, postTitle, postBody, seoKeywords, seoDescription);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(postTitle).into(PostPage.POST_TITLE),
                Click.on(PostPage.PERMALINK),
                Enter.theValue(postBody).into(PostPage.POST_BODY),
                SelectFromOptions.byVisibleText("extreme sports").from(PostPage.CATEGORY),
                Enter.theValue(seoKeywords).into(PostPage.SEO_KEYWORDS),
                Enter.theValue(seoDescription).into(PostPage.SEO_DESCRIPTION),
                Click.on(PostPage.SUBMIT_BUTTON)

        );
    }
}
