var isfreeze = new Array(); isfreeze['0']='正常'; isfreeze['1']='冻结'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForisfreeze(selectValue){ writeSelectAllOptionForisfreeze_(selectValue,'所有', false); } function writeSelectAllOptionForisfreeze_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in isfreeze){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+isfreeze[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+isfreeze[p]+'</option>'; } } document.write('<select name=isfreeze '+(required? 'required':'')+' lay-verify="isfreeze" lay-filter="isfreeze" id="isfreeze">'+content+'</select>'); } var xnx3_r1550905538 = '11111111111111111111111111111111111111111111111111111111111111111111111';