var client = new Array(); client['1']='电脑端(旧版，已不推荐)'; client['2']='手机端(旧版，已不推荐)'; client['3']='CMS(新版，推荐)'; /*页面上输出选择框的所有option，显示到页面上*/ function writeSelectAllOptionForclient(selectValue){ writeSelectAllOptionForclient_(selectValue,'所有', false); } function writeSelectAllOptionForclient_(selectValue,firstTitle,required){ var content = ""; if(selectValue==''){ content = content + '<option value="" selected="selected">'+firstTitle+'</option>'; }else{ content = content + '<option value="">'+firstTitle+'</option>'; } for(var p in client){ if(p == selectValue){ content = content+'<option value="'+p+'" selected="selected">'+client[p]+'</option>'; }else{ content = content+'<option value="'+p+'">'+client[p]+'</option>'; } } document.write('<select name=client '+(required? 'required':'')+' lay-verify="client" lay-filter="client" id="client">'+content+'</select>'); } var xnx3_r1551331795 = '1111111111111111111111111111111111111111111111111111111111111111111111';