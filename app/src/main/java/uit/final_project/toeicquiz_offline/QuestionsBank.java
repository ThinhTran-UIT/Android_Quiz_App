package uit.final_project.toeicquiz_offline;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> part1Questions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass the questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Part1_Test", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question2 = new QuestionsList("Part1_Test2", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question3 = new QuestionsList("Part1_Test3", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question4 = new QuestionsList("Part1_Test4", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question5 = new QuestionsList("Part1_Test5", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question6 = new QuestionsList("Part1_Test6", "16bit", "17bit","18bit","19bit","16bit","");

        //Add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> part2Questions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass the questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Part2_Test", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question2 = new QuestionsList("Part2_Test2", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question3 = new QuestionsList("Part2_Test3", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question4 = new QuestionsList("Part2_Test4", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question5 = new QuestionsList("Part2_Test5", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question6 = new QuestionsList("Part2_Test6", "16bit", "17bit","18bit","19bit","16bit","");

        //Add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> part3Questions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass the questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Part3_Test", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question2 = new QuestionsList("Part3_Test2", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question3 = new QuestionsList("Part3_Test3", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question4 = new QuestionsList("Part3_Test4", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question5 = new QuestionsList("Part3_Test5", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question6 = new QuestionsList("Part3_Test6", "16bit", "17bit","18bit","19bit","16bit","");

        //Add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> part4Questions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass the questions along with options and answer
        final QuestionsList question1 = new QuestionsList("Part4_Test", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question2 = new QuestionsList("Part4_Test2", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question3 = new QuestionsList("Part4_Test3", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question4 = new QuestionsList("Part4_Test4", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question5 = new QuestionsList("Part4_Test5", "16bit", "17bit","18bit","19bit","16bit","");
        final QuestionsList question6 = new QuestionsList("Part4_Test6", "16bit", "17bit","18bit","19bit","16bit","");

        //Add all questions to List<QuestionList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "part1":
                return part1Questions();
            case "part2":
                return part2Questions();
            case "part3":
                return part3Questions();
            default:
                return part4Questions();
        }
    }
}
