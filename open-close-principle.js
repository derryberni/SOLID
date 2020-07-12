// need fix
class Product {
   /** product entities */
}

class ShippingOrderService {
   checkout(product, type) {
       switch (type) {
           case ShippingType.JNE:
               /** do checkout product with shipping type **/
               break;
           case ShippingType.TIKI:
               /** do checkout product with shipping type **/
               break;
           case ShippingType.POSINDO:
               /** do checkout product with shipping type **/
               break;
           default:
               throw new TypeError("Unsupported shipping type")
       }
   }
}

const ShippingType = {
   JNE: "jne",
   TIKI: "tiki",
   POSINDO: "posindo"
};

// fix
class ShippingOrderService {
   checkout(product, shipping) {
       const costShipping = shipping.calculate(product);
       /** Code to do check **/
   }
}

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
       return /** calculate amount of this type with product*/;
   }
}

class TIKIShipping extends Shipping {
   calculate(product) {
       return /** calculate amount of this type with product*/;
   }
}

class POSINDOShipping extends Shipping {
   calculate(product) {
       return /** calculate amount of this type with product*/;
   }
}
class SiCepatShipping extends Shipping {
   calculate(product) {
       return /** calculate amount of this type with product*/;
   }
}
