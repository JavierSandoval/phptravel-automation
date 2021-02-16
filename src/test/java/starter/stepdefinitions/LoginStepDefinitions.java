package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import starter.navigation.NavigateTo;
import starter.questions.CreatedItems;
import starter.tasks.DoBlogCategory;
import starter.tasks.DoNewPost;
import starter.ui.blog.BlogPage;
import starter.ui.dashboard.DashboardPage;
import starter.tasks.DoLogin;
import starter.ui.post.PostPage;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) has an active account")
    public void has_an_active_account(String name){
        this.name = name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials(){
        theActorCalled(name).attemptsTo(
                NavigateTo.thePhpTravelsLoginPage(),
                DoLogin.withCredentials("admin@phptravels.com", "demoadmin")
        );
    }

    @Then("he should have access to the blog page")
    public void he_should_have_access_to_the_blog_page(){
        theActorCalled(name).attemptsTo(
                Click.on(DashboardPage.BLOG_ITEM),
                Click.on(DashboardPage.BLOG_CATEGORIES)
        );
    }

    @Given("^(.*) wants create a new blog category")
    public void wants_create_a_new_blog_category(String name){

        this.name = name;
        theActorInTheSpotlight().attemptsTo(
                Click.on(BlogPage.ADD_BUTTON)
        );
    }

    @When("he fills all the fields")
    public void he_fills_all_the_fields(){
        theActorCalled(name).attemptsTo(
                DoBlogCategory.fillAllFields(
                        "extreme sports",
                        "extreme sports",
                        "extreme sports",
                        "extreme sports",
                        "extreme sports",
                        "extreme sports",
                        "extreme sports",
                        "extreme sports",
                        "extreme sports"
                )
        );
    }

    @Then("he should be find it into the category list")
    public void he_should_be_find_it_into_the_category_list(){
        //System.out.println(CreatedItems.createdCategory().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("the added category should be displayed in the list", CreatedItems.createdCategory(),equalTo("extreme sports"))
        );
    }

    @Given("^(.*) wants create a new post")
    public void wants_create_a_new_post(String name){

        this.name = name;
        theActorInTheSpotlight().attemptsTo(
                Click.on(DashboardPage.BLOG_ITEM),
                Click.on(DashboardPage.POSTS)
        );
    }

    @When("he complete all the fields")
    public void he_complete_all_the_fields(){
        theActorCalled(name).attemptsTo(
                Click.on(PostPage.ADD_BUTTON),
                DoNewPost.completeAllFields(
                        "Defining Extreme Sport",
                        "Indeed, the lack of consistency within the term “extreme sport means that those wishing to study this field are forced to create their own criteria as a starting point, often in a less than scientific manner",
                        "The most incredible post ever",
                        "sports, adventure"
                )
        );
    }

    @Then("he should be find it into the post list")
    public void he_should_be_find_it_into_the_post_list(){
        /*theActorInTheSpotlight().should(
                seeThat("the added post title should be displayed in the list", CreatedItems.createdPost(),equalTo("Defining Extreme Sport"))
        );*/
    }
}
