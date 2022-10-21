package HW9.task1_2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RecipesBook {
    private final Set<Recipes> recipesBook;

    public RecipesBook() {
        recipesBook = new HashSet<>();
    }

    public void addRecipes(Recipes recipes) throws RuntimeException {
        if (recipesBook.contains(recipes)) {
            throw new RuntimeException("Такой рецепт уже имеется");
        } else {
            recipesBook.add(recipes);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipesBook that = (RecipesBook) o;
        return Objects.equals(recipesBook, that.recipesBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipesBook);
    }

    @Override
    public String toString() {
        return "Книга рецептов{" +
                "recipesBook=" + recipesBook +
                '}';
    }
}
