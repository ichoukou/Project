var type = new Array(); type['1']='内页Banner'; type['2']='首页Banner'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionFortype(selectValue){ writeSelectAllOptionFortype_(selectValue,'所有', false); } function writeSelectAllOptionFortype_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in type){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+type[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+type[p]+'</option>'; } } document.write('<select name=type '+(required? 'required':'')+' lay-verify="type" lay-filter="type" id="type">'+content+'</select>'); } var xnx3_r1550693114 = '11111111111111111111111111111111111111111111111';