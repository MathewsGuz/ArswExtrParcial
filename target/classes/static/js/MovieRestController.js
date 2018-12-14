/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var RestControllerModule = (function () {
  
  var getInfo = function (title,year,callback) {
    axios.get('/movie/'+title+"/"+year)
            .then(function(info){
                callback.onSuccess(info.data);
                console.log(info);
            })
            .catch(function(error){
                callback.onFailed(error);
                console.log(error);
            });
  };
  
  

  return {
    getInfo: getInfo
  };
  
  

})();

