package tj.politech.diplom.domain.simple_test.repository

import tj.politech.diplom.domain.response.typeAlias.GenericResponseArrayList
import tj.politech.diplom.domain.simple_test.entity.SimpleTestEntity

interface SimpleTestRepository {
    fun getSimpleTest(subjectId: Int, count: Int): GenericResponseArrayList<SimpleTestEntity>
}