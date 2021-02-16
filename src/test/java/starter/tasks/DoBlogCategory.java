package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.blog.BlogPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoBlogCategory implements Task {

    private final String categoryName;
    private final String nameVietnamese;
    private final String nameRussian;
    private final String nameArabic;
    private final String nameFarsi;
    private final String nameTurkish;
    private final String nameFrench;
    private final String nameSpanish;
    private final String nameGerman;

    public DoBlogCategory(
            String categoryName,
            String nameVietnamese,
            String nameRussian,
            String nameArabic,
            String nameFarsi,
            String nameTurkish,
            String nameFrench,
            String nameSpanish,
            String nameGerman
    ){
        this.categoryName = categoryName;
        this.nameVietnamese = nameVietnamese;
        this.nameRussian = nameRussian;
        this.nameArabic = nameArabic;
        this.nameFarsi = nameFarsi;
        this.nameTurkish = nameTurkish;
        this.nameFrench = nameFrench;
        this.nameSpanish = nameSpanish;
        this.nameGerman = nameGerman;
    }

    public static Performable fillAllFields(
            String categoryName,
            String nameVietnamese,
            String nameRussian,
            String nameArabic,
            String nameFarsi,
            String nameTurkish,
            String nameFrench,
            String nameSpanish,
            String nameGerman
    ){
        return instrumented(DoBlogCategory.class, categoryName, nameVietnamese, nameRussian, nameArabic, nameFarsi, nameTurkish, nameFrench, nameSpanish, nameGerman);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(categoryName).into(BlogPage.CATEGORY_NAME),
                Enter.theValue(nameVietnamese).into(BlogPage.NAME_IN_VIETNAMESE),
                Enter.theValue(nameRussian).into(BlogPage.NAME_IN_RUSSIAN),
                Enter.theValue(nameArabic).into(BlogPage.NAME_IN_ARABIC),
                Enter.theValue(nameFarsi).into(BlogPage.NAME_IN_FARSI),
                Enter.theValue(nameTurkish).into(BlogPage.NAME_IN_TURKISH),
                Enter.theValue(nameFrench).into(BlogPage.NAME_IN_FRENCH),
                Enter.theValue(nameSpanish).into(BlogPage.NAME_IN_SPANISH),
                Enter.theValue(nameGerman).into(BlogPage.NAME_IN_GERMAN),
                Click.on(BlogPage.SUBMIT_ADD_BUTTON)
        );
    }
}