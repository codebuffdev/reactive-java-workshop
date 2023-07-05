package in.codebuffdev.reactiveworkshop;

import java.util.List;
import java.util.Objects;

/**
 * Java stream refresher
 */

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        System.out.println("Print all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream().forEach(System.out::println);
        long count = StreamSources.intNumbersStream().count();
        System.out.println("\nCount of numbers in intNumbersStream " + count);

        System.out.println("\nPrint numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream().filter(integer -> integer < 5).forEach(System.out::println);

        System.out.println("\nPrint the second and third numbers in intNumbersStream that's greater than 5");
        StreamSources.intNumbersStream().filter(integer -> integer > 5).skip(1).limit(2).forEach(System.out::println);

        System.out.println("\nPrint the first number in intNumbersStream that's greater than 5, If nothing is found, print -1");
        Integer isFound = StreamSources.intNumbersStream().filter(integer -> integer > 5).findFirst().orElse(-1);
        System.out.println(isFound);

        System.out.println("\nPrint first names of all users in userStream");
        StreamSources.userStream().map(User::getFirstName).forEach(System.out::println);

        System.out.println("\nPrint first names in userStream for users that have IDs from number stream");
        List<Integer> intNumberStreamNum = StreamSources.intNumbersStream().toList();
        List<User> collectedUser = StreamSources.userStream().toList();
        collectedUser.stream().map(
                user -> {
                    if (intNumberStreamNum.contains(user.getId())) {
                        return user;
                    }
                    return null;
                }
        ).filter(Objects::nonNull).forEach(System.out::println);
    }
}
