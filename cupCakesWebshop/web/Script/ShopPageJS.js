/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//        
//if(balance>99){alert("balance over 100!"+" ") }
//
//else if(balance<99){alert("balance under 100!")};
//if(totalPrice==0){alert("hej")};
//    
//  


    var placeOrder = function(balance,totalPrice){   
    
    
    
    };    
 

    var placeOrder = function(balance,totalPrice){


      if(totalPrice>balance){alert("You dosent have enough money!");}
      else if (balance>totalPrice){
          balance = balance-totalPrice;
            alert("you have bought for "+totalPrice+". You balance is "+balance);
            document.getElementById("test").submit();};  
  
    
    };
    


  
      var AddToCart = function(balance,totalPrice){
          
          var cartTable = document.getElementById("cartTable");
    // cartTable.innerHTML = "";

       var row = cartTable.insertRow(0);
   row.insertCell(0).innerHTML ="st";
  row.insertCell(1).innerHTML = "test4";
    row.insertCell(2).innerHTML ="test2";
       
      
      
      
      };

//  
//for(var i=0; i<student.length; i++){
//var row = tableBody.insertRow(i);  
//
//    var deleteBtn = document.createElement("button");
//    var text = document.createTextNode("Delete"); 
//    deleteBtn.appendChild(text);
//    deleteBtn.id = student[i].name;
//    deleteBtn.name = "deleteB";
//
//    row.insertCell(0).innerHTML =student[i].name;
//  row.insertCell(1).innerHTML =student[i].phone;
//    row.insertCell(2).innerHTML =student[i].mail;
//   row.insertCell(3).innerHTML =student[i].level;
//  if(student[i].group!=""){  row.insertCell(4).innerHTML =student[i].group;}
//  else{
//      var tField = document.createElement("INPUT");
//          tField.setAttribute("type", "text");
//          tField.id = i;
//          tField.name = "delete";
//
//      row.insertCell(4).appendChild(tField);}
//  // row.insertCell(5).appendChild(deleteBtn);
//    var cell  = row.insertCell(5);
//    var btn = document.createElement("button");
//    btn.innerHTML = "Delete";
//    cell.appendChild(btn);
//    
//    btn.onclick = (function(){
//        
//        var inc = i;
//        return function(){
//            student.splice(inc,1);
//                populateTable();
//
//            
//        };
//        
//        
//    })();
//    
//    
