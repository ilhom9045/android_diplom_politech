package tj.politech.diplom.repository.simple_test

import tj.politech.diplom.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.simple_test.entity.SimpleTestEntity
import tj.politech.diplom.simple_test.repository.SimpleTestRepository

class SimpleTestRepositoryImpl(private val simpleTestApi: SimpleTestApi):SimpleTestRepository {
    override fun getSimpleTest(subjectId:Int,count: Int): GenericResponseArrayList<SimpleTestEntity> {
        return simpleTestApi.getSimpleTest(subjectId = subjectId,testCount= count)
    }
}