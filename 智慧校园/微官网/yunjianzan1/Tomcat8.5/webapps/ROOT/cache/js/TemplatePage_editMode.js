var editMode = new Array(); editMode['1']='可视化编辑'; editMode['2']='纯代码编辑'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForeditMode(selectValue){ writeSelectAllOptionForeditMode_(selectValue,'所有', false); } function writeSelectAllOptionForeditMode_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in editMode){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+editMode[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+editMode[p]+'</option>'; } } document.write('<select name=editMode '+(required? 'required':'')+' lay-verify="editMode" lay-filter="editMode" id="editMode">'+content+'</select>'); } var xnx3_r1551331795 = '111111';