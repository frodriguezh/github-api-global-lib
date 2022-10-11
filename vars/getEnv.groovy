
def call(){
 
 def datas = readYaml text: """
something: 'my datas'
size: 3
isEmpty: false
"""
 assert datas.something == 'my datas'
 assert datas.size == 3
 assert datas.isEmpty == false
 
}

