class Shipping {
   constructor() {
       if(this.constructor === Shipping) {
           throw new TypeError(`Abstract class "${this.constructor.name}" cannot be instantiated directly.`);
       }
   }

   /**
    * Implementation required
    */
   calculate(product) {
       throw new Error('You have to implement the method calculate!');
   }
}

class JNEShipping extends Shipping {
   calculate(product) {
       return 100 * product;
   }
}

class TIKIShipping extends Shipping {
   calculate(product) {
       return 200 * product;
   }
}

class ShippingOrderService {
   checkout(product, shipping) {
       var costShipping = shipping.calculate(product);
       return costShipping;
   }
}
