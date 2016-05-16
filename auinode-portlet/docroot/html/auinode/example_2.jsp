<%@include file="/html/auinode/init.jsp"%>


<aui:row>
	<aui:row>
		<span id="spanId"></span>
	</aui:row>
	<aui:row>
		<input type="text" id="textId" value=""/>
	</aui:row>
</aui:row>

<aui:script>
	AUI().use('aui-node', function(A){
		
		var text = A.one('#textId');
		
		text.on(
			'change', function(){
				var spanNode = A.one('#spanId');
				
				var value = text.val();
				spanNode.text(value);
			}
		);
	});
</aui:script>