var used = new Array(); used['1']='已使用'; used['0']='未使用'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForused(selectValue){ writeSelectAllOptionForused_(selectValue,'所有', false); } function writeSelectAllOptionForused_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in used){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+used[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+used[p]+'</option>'; } } document.write('<select name=used '+(required? 'required':'')+' lay-verify="used" lay-filter="used" id="used">'+content+'</select>'); } var xnx3_r1550741275 = '111111111111111111111111111111111';