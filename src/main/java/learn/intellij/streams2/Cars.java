package learn.intellij.streams2;

import java.util.Objects;

public class Cars {

  String model;

  public String getModel() {
    return model;
  }

  @Override
  public String toString() {
    return "Cars{" +
        "model='" + model + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cars cars = (Cars) o;
    return Objects.equals(model, cars.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model);
  }

  public void setModel(String model) {
    this.model = model;

  }
}
