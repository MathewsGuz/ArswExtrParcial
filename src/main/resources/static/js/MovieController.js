/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var MovieConsultController = function(){
    var ShowMovie =function(){
        var title= document.getElementById('movie').value;
        var date =document.getElementById('date').value;
        
        var callback ={
            onSuccess: function(response){
                console.log(response);
                
//                document.getElementById('respuesta').innerHTML=response.Title;
                var table = document.getElementById("List");
                 for (var r = 0; r < 1; r++) {
                    var row = document.createElement("tr");

                     // create cells in row
                     //document.createTextNode(Math.floor(Math.random() * (10 - 1 + 1)) + 1);
                    var columnaChain = document.createElement("td");
                    var Text = document.createTextNode(response.Title);
                    columnaChain.appendChild(Text);
                    var columnaDate = document.createElement("td");
                    var Date = document.createTextNode(response.Plot);
                    columnaDate.appendChild(Date);
                    var ColumnaPoster=document.createElement("td");
                    var poster=document.createTextNode(response.Poster);
                    ColumnaPoster.appendChild(poster);
         
                    row.appendChild(columnaChain);
                    row.appendChild(columnaDate);
                    row.appendChild(ColumnaPoster);
 
                table.appendChild(row); // add the row to the end of the table body
                }
            },
            onFailed: function(response){
                console.log(response);
                alert("There is a problem with our servers. We apologize for the inconvince, please try again later");  
            }
        };
        RestControllerModule.getInfo(title,date,callback);
    };
    return{
        ShowMovie:ShowMovie
    };
}();
