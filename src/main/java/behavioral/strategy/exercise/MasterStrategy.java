package behavioral.strategy.exercise;

public class MasterStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = true;

        isValid = creditCard.getNumber().startsWith("66") ||
                creditCard.getNumber().startsWith("88");

        if (isValid) {
            isValid = creditCard.getNumber().length() == 10;
        }

        if(isValid) {
            isValid = passesLuhn(creditCard.getNumber());
        }

        return isValid;
    }
}
