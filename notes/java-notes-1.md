# Classes abstratas e Interfaces

## Herança

```
Animal
  - Cat
  - Dog
  - Rodent
    - Mice
    - Mouse
```

```java
  // casting
  double a = (double)3;

  // instantiating objects
  Cat myCat = new Cat();

  // upcasting
  Animal a = new Cat();
  Animal b = new Dog();
```

## Relacionamentos

- Herança ("é um")
- Composição

### Composicao

```java
public class Person {
  private String name;
  private int age;
  private Address address; // has one
  private List<Goal> goals; // has many
}

public class Address {
  private String city;
  private String country;
  private int number;
}

public class Goal {
  private String name;
  private LocalDate start;
  private LocalDate end;
}
```

## Classes abstratas

Classes abstratas nao produzem objeto.

```
Account
  - SavingsAccount
  - CreditAccount
```
