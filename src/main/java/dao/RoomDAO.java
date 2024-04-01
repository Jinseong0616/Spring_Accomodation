package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.RoomDTO;
import dto.SearchDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoomDAO {
	
	final SqlSession sqlSession;
	
	
	//�� �߰��ϱ�
	public int add(RoomDTO dto) {
//		System.out.println(dto.getBu_email());
//		System.out.println(dto.getRo_count());
//		System.out.println(dto.getRo_name());
//		System.out.println(dto.getRo_price());
//		
//		System.out.println(dto.getCheckin());
//		System.out.println(dto.getCheckout());
//		System.out.println(dto.getRo_info());
//		System.out.println(dto.getRo_picture());
//		System.out.println(dto.getPicture_count());
//		
		
		
		return sqlSession.insert("r.room_insert",dto);
	}
	
	//�� ��ü��ȸ
	public List<RoomDTO> selectList(String bu_email) {
		return sqlSession.selectList("r.room_list",bu_email);
	}
	
	//�� �ϳ� ��ȸ
	public RoomDTO selectOne(int ro_num) {
		return sqlSession.selectOne("r.room_selectOne", ro_num);
	}
	
	//���� ���� ����
	public int update(RoomDTO dto) {
		return sqlSession.update("r.room_update",dto);
	}
	
	//���� ����
	public int delete(int num) {
		return sqlSession.delete("r.room_delete",num);
	}
	
}
