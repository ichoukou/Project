var useKefu = new Array(); useKefu['1']='启用'; useKefu['0']='关闭'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForuseKefu(selectValue){ writeSelectAllOptionForuseKefu_(selectValue,'所有', false); } function writeSelectAllOptionForuseKefu_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in useKefu){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+useKefu[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+useKefu[p]+'</option>'; } } document.write('<select name=useKefu '+(required? 'required':'')+' lay-verify="useKefu" lay-filter="useKefu" id="useKefu">'+content+'</select>'); } var xnx3_r1550661215 = '1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111';