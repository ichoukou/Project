var legitimate = new Array(); legitimate['1']='合法'; legitimate['0']='涉嫌'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForlegitimate(selectValue){ writeSelectAllOptionForlegitimate_(selectValue,'所有', false); } function writeSelectAllOptionForlegitimate_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in legitimate){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+legitimate[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+legitimate[p]+'</option>'; } } document.write('<select name=legitimate '+(required? 'required':'')+' lay-verify="legitimate" lay-filter="legitimate" id="legitimate">'+content+'</select>'); } var xnx3_r1550905534 = '11111111111111111111111111111111111111111111111111111111111111111111111';