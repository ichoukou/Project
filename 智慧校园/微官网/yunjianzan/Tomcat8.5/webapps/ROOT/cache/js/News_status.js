var status = new Array(); status['1']='显示'; status['2']='隐藏'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForstatus(selectValue){ writeSelectAllOptionForstatus_(selectValue,'所有', false); } function writeSelectAllOptionForstatus_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in status){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+status[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+status[p]+'</option>'; } } document.write('<select name=status '+(required? 'required':'')+' lay-verify="status" lay-filter="status" id="status">'+content+'</select>'); } var xnx3_r1550693115 = '111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111';