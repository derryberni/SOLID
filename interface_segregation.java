// need fix
interface IPayment {
   void setPaymentName();
   void setAmount();
   void bankID();
   void virtualBankID();
   void accountID();
}

class Gopay implements IPayment {
   @Override
   public void setPaymentName() {
       // Implementation code
   }

   @Override
   public void setAmount() {
       // Implementation code
   }

   @Override
   public void bankID() {
       // Implementation code
   }

   @Override
   public void virtualBankID() {
       // Implementation code
   }

   @Override
   public void accountID() {
       // Implementation code
   }
}

class Mandiri implements IPayment {
   @Override
   public void setPaymentName() {
       // Implementation code
   }

   @Override
   public void setAmount() {
       // Implementation code
   }

   @Override
   public void bankID() {
       // Implementation code
   }

   @Override
   public void virtualBankID() {
       // Implementation code
   }

   @Override
   public void accountID() {
       // Implementation code
   }
}

class BNI implements IPayment {
   @Override
   public void setPaymentName() {
       // Implementation code
   }

   @Override
   public void setAmount() {
       // Implementation code
   }

   @Override
   public void bankID() {
       // Implementation code
   }

   @Override
   public void virtualBankID() {
       // Implementation code
   }

   @Override
   public void accountID() {
       // Implementation code
   }
}


//fix
interface EWalletProvider {
   void accountID();
   void walletProviderID();
}

interface PaymentProvider {
   void paymentName();
   void amount();
}

interface BankProvider {
   void bankID();
   void virtualAccount();
}

class Gopay implements EWalletProvider, PaymentProvider {
   @Override
   public void paymentName() {
       // Implementation code
   }

   @Override
   public void amount() {
       // Implementation code
   }

   @Override
   public void accountID() {
       // Implementation code
   }
   @Override
   public void walletProviderID() {
       // Implementation code
   }
}

class Mandiri implements BankProvider, PaymentProvider {
   @Override
   public void paymentName() {
       // Implementation code
   }

   @Override
   public void amount() {
       // Implementation code
   }

   @Override
   public void bankID() {
       // Implementation code
   }
   @Override
   public void virtualAccount() {
       // Implementation code
   }
}

class BNI implements BankProvider, PaymentProvider {
   @Override
   public void paymentName() {
       // Implementation code
   }

   @Override
   public void amount() {
       // Implementation code
   }

   @Override
   public void bankID() {
       // Implementation code
   }
   @Override
   public void virtualAccount() {
       // Implementation code
   }
}
