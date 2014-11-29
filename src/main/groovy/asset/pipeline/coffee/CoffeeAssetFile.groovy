package asset.pipeline.coffee
import asset.pipeline.CacheManager
import asset.pipeline.AbstractAssetFile
import asset.pipeline.AssetHelper
import java.util.regex.Pattern

class CoffeeAssetFile extends AbstractAssetFile {
	static final contentType = ['application/javascript','application/x-javascript','text/javascript']
	static extensions = ['coffee', 'js.coffee']
	static final String compiledExtension = 'js'
	static processors = [CoffeeScriptProcessor]
	Pattern directivePattern = ~/(?m)#=(.*)/

}
