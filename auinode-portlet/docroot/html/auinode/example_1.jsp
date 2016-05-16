<%@include file="/html/auinode/init.jsp"%>


<aui:row>
	<aui:row>
		<img src="<%= renderRequest.getContextPath() %>/images/cover.png" id="coverImageId"/>
	</aui:row>
	<aui:row>
		<input type="button" id="toggleId" value="Toggle"/>
	</aui:row>
</aui:row>

<aui:script>
	AUI().use('aui-node', function(A){
		
		var button = A.one('#toggleId');
		
		button.on(
			'click', function(){
				var imageNode = A.one('#coverImageId');
				
				imageNode.toggle();
			}
		);
	});
</aui:script>