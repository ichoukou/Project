var state = new Array(); state['1']='已读'; state['0']='未读'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForstate(selectValue){ writeSelectAllOptionForstate_(selectValue,'所有', false); } function writeSelectAllOptionForstate_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in state){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+state[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+state[p]+'</option>'; } } document.write('<select name=state '+(required? 'required':'')+' lay-verify="state" lay-filter="state" id="state">'+content+'</select>'); } var xnx3_r1550741067 = '111111111111111111111111111111111111111111111111111111111111111111111111111111111111111';