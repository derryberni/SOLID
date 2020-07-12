// need fix
class FoodService {
   constructor(id, name, date) {
       this.id = id;
       this.name = name;
       this.date = date;
   }

   addToStore() {
       if(!this.isExpired()) {
           // Add to store
       }
   }

   isExpired() {
       const stringDateArray = this.date.split("/");
       const foodDate = new Date(...stringDateArray);
       return foodDate >= new Date();
   }
}


// fix
class FoodService {
   constructor(id, name, date) {
       this.id = id;
       this.name = name;
       this.date = date;
   }

   addToStore() {
       if(!FoodExpiry.isExpired(this.date)) {
           // Add to store
       }
   }
}

class FoodExpiry {
   static isExpired(date) {
       const stringDateArray = date.split("/");
       const foodDate = new Date(...stringDateArray);
       return foodDate >= new Date();
   }
}
