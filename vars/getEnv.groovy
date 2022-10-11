
def call(){
 
 def datas = readYaml text: """
something: 'my datas'
size: 3
isEmpty: false
"""
 println datas.something
 println datas.size
 println datas.isEmpty
 
}

