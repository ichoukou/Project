var isdelete = new Array(); isdelete['1']='已删除'; isdelete['0']='正常'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForisdelete(selectValue){ writeSelectAllOptionForisdelete_(selectValue,'所有', false); } function writeSelectAllOptionForisdelete_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in isdelete){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+isdelete[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+isdelete[p]+'</option>'; } } document.write('<select name=isdelete '+(required? 'required':'')+' lay-verify="isdelete" lay-filter="isdelete" id="isdelete">'+content+'</select>'); } var xnx3_r1550693131 = '111111111111111111111111111111';