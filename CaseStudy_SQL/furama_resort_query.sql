-- KHACH HANG
create table furama_resort.LoaiKhach(
	IDLoaiKhach int,
    TenLoaiKhach varchar(45) not null unique,
    primary key(IDLoaiKhach)
);
create table furama_resort.KhachHang(
	IDKhachHang int,
    IDLoaiKhach int,
    HoTen varchar(45) not null,
    NgaySinh date,
    SoCMND varchar(45) unique,
    SoDienThoai varchar(45) not null unique,
    Email varchar(45) not null unique,
    DiaChi varchar(255),
    primary key(IDKhachHang),
    foreign key(IDLoaiKhach) references furama_resort.LoaiKhach(IDLoaiKhach)
);
-- DICH VU
create table furama_resort.KieuThue(
	IDKieuThue int,
    TenKieuThue varchar(45) not null unique,
    Gia int not null,
    primary key(IDKieuThue)
);
create table furama_resort.LoaiDichVu(
	IDLoaiDichVu int,
    TenLoaiDichVu varchar(100) not null unique,
    primary key(IDLoaiDichVu)
);
create table furama_resort.DichVu(
	IDDichVu int,
    TenDichVu varchar(45),
    DienTich int,
    SoTang int,
    SoNguoiToiDa varchar(45),
    ChiPhiTHue varchar(45),
    IDKieuThue int,
    IdLoaiDichVu int,
    TrangThai varchar(45),
    primary key(IDDichVu),
    foreign key(IdKieuThue) references furama_resort.KieuThue(IdKieuThue),
    foreign key(IdKieuThue) references furama_resort.LoaiDichVu(IDLoaiDichVu)
);
alter table furama_resort.DichVu
	modify SoNguoiToiDa int,
    modify ChiPhiTHue int;
    
-- HOP DONG DICH VU
create table furama_resort.HopDong(
	IDHopDong int,
    IDNhanVien int not null,
    IDKhachHang int not null,
    IDDichVu int not null,
    NgayLamHopDong date not null,
    NgayKetThuc date,
    TienDatCoc int,
    TongTien int,
    primary key(IdHopDong),
    foreign key(IDNhanVien) references furama_resort.NhanVien(IDNhanVien),
    foreign key(IdKhachHang) references furama_resort.KhachHang(IDKhachHang),
    foreign key(IdDichVu) references furama_resort.DichVu(IDDichVu)
);
create table furama_resort.HopDongChiTiet(
	IDHopDongChiTiet int,
    IDHopDong int not null,
    IDDichVuDiKem int not null,
    SoLuong int,
	primary key(IDHopDongChiTiet),
	foreign key(IDHopDong) references furama_resort.HopDong(IDHopDong),
	foreign key(IdDichVuDiKem) references furama_resort.DichVuDiKem(IdDichVuDiKem)
);
create table furama_resort.DichVuDiKem(
	IdDichVuDiKem int,
    TenDichVuDiKem varchar(45) unique,
    Gia int not null,
    DonVi int,
    TrangThaiKhaDung varchar(45),
    primary key(IdDichVuDiKem)
);
alter table furama_resort.DichVuDiKem
	add SoLuong int default 0
		after Gia,
	modify DonVi varchar(45) not null;
alter table furama_resort.DichVuDiKem
	drop column SoLuong;
    
-- NHAN VIEN
create table furama_resort.ViTri(
	IDViTri int,
    TenViTri varchar(45) not null unique,
    primary key(IDViTri)
);
create table furama_resort.TrinhDo(
	IDTrinhDo int,
    TrinhDo varchar(45) not null unique,
    primary key(IDTrinhDo)
);
create table furama_resort.BoPhan(
	IDBoPhan int,
    TenBoPhan varchar(45) not null unique,
    primary key(IDBoPhan)
);
create table furama_resort.NhanVien(
	IDNhanVien int,
    HoTen varchar(45),
    IDViTri int,
    IDTrinhDo int,
    IDBoPhan int,
    NgaySinh date,
    SoCMND varchar(45),
    Luong varchar(45),
    SoDienThoai varchar(45) not null unique,
    Email varchar(45) not null unique,
    DiaChi varchar(255),
    primary key(IDNhanVien),
    foreign key(IDViTri) references furama_resort.ViTri(IDViTri),
    foreign key(IDTrinhDo) references furama_resort.TrinhDo(IDTrinhDo),
    foreign key(IDBoPhan) references furama_resort.BoPhan(IDBoPhan)
);

-- 1.Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.
-- MAKE DATA khachhang (import seperated file)
-- MAKE DATA nhanvien (import seperated file)
-- MAKE DATA hopdong (import seperated 2 files)
-- MAKE DATA hopdongchitiet (import seperated 2 files)
-- MAKE DATA loaikhach Diamond, Platinum, Gold, Silver, Member
insert into furama_resort.loaikhach values
    (1,'Diamond'),
    (2,'Platinum'),
    (3,'Gold'),
    (4,'Silver'),
    (5,'Member');
-- MAKE DATA vitri nhanvien ( Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.)
insert into furama_resort.ViTri values
    (1,'Le Tan'),
    (2,'Phuc Vu'),
    (3,'Chuyen Vien'),
    (4,'Giam Sat'),
    (5,'Quan Ly'),
    (6,'Giam Doc');
-- MAKE DATA trinhdo nhanvien (Trung cấp, Cao đẳng, Đại học và sau đại học)
insert into furama_resort.TrinhDo values
    (1,'Trung Cap'),
    (2,'Cao Dang'),
    (3,'Dai Hoc'),
    (4,'Sau Dai Hoc');
-- MAKE DATA bophan nhanvien (Sale – Marketing, Hành Chính, Phục vụ, Quản lý.)
insert into furama_resort.BoPhan values
    (1,'Sale – Marketing'),
    (2,'Hanh Chinh'),
    (3,'Phuc Vu'),
    (4,'Quan Ly');
-- MAKE DATA dichvu (Villa, House, Room.) (chưa run)
insert into furama_resort.DichVu (IDDichVu,TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiTHue,IDKieuThue,IdLoaiDichVu,TrangThai)
values
    (1,'Villa',250,2,6,30000000,1,1,'Hoat Dong'),
    (2,'Villa',250,2,6,25000000,2,1,'Hoat Dong'),
    (3,'Villa',250,2,6,20000000,3,1,'Hoat Dong'),
    (4,'House',180,2,6,22000000,1,1,'Hoat Dong'),
    (5,'House',180,2,6,17000000,2,1,'Hoat Dong'),
    (6,'House',180,2,6,14000000,3,1,'Hoat Dong'),
    (7,'Room',45,0,6,4900000,1,1,'Hoat Dong'),
    (8,'Room',45,0,6,4000000,2,1,'Hoat Dong'),
    (9,'Room',45,0,6,3500000,3,1,'Hoat Dong'),
    (10,'Meeting Room',200,0,100,20000000,2,5,'Hoat Dong'),
    (11,'To Chuc Su Kien',0,0,200,90000000,1,6,'Hoat Dong');
-- MAKE DATA loai dich vu
insert into furama_resort.loaidichvu(IDLoaiDichVu,TenLoaiDichVu)
values
    (001,'Luu Tru'),
    (002,'Nha Hang'),
    (003,'Tham Quan'),
    (004,'Giai Tri'),
    (005,'Phong Hop'),
    (006,'To Chuc Su Kien');
-- MAKE DATA kieu thue
insert into furama_resort.KieuThue(IDKieuThue,TenKieuThue,Gia)
values
    (01,'Full Package',0),
    (02,'Options',0),
    (03,'Basic',0);
-- MAKE DATA loai dich vu di kem (massage, karaoke, thức ăn, nước uống, thuê xe di chuyển tham quan resort)
insert into furama_resort.DichVuDiKem(IdDichVuDiKem,TenDichVuDiKem,Gia,SoLuong,DonVi,TrangThaiKhaDung)
values
    (1,'Massage',699000,0,'Set 60ph','Hoat dong'),
    (2,'Karaoke',499000,0,'Gio','Hoat dong'),
    (3,'Thuc An',250000,0,'Mon','Hoat dong'),
    (4,'Nuoc Uong',35000,0,'Lon/Chai','Hoat dong'),
    (5,'Giat Ui',30000,0,'Cai','Hoat dong'),
    (6,'Thue Xe Tham Quan Resort',500000,0,'Chuyen','Hoat dong');
    
-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select * from furama_resort.NhanVien
	where (HoTen like 'H%' or HoTen like 'T%' or HoTen like 'K%') and length(HoTen) > 15;
    
-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from furama_resort.KhachHang
	where ((datediff(curdate(),KhachHang.NgaySinh)/365) > 18 and (datediff(curdate(),KhachHang.NgaySinh)/365) < 50 )
		and  DiaChi in ('Da Nang','Quang Tri');
        
-- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần
select KhachHang.IDKhachHang, KhachHang.HoTen, KhachHang.IDLoaiKhach, HopDong.IDHopDong, count(HopDong.IDHopDong) as 'So lan dat phong'
	from furama_resort.KhachHang
    join furama_resort.HopDong on KhachHang.IDKhachHang = HopDong.IDKhachHang
    where KhachHang.IDLoaiKhach = 1
    group by KhachHang.IDKhachHang
    order by count(HopDong.IDHopDong) asc;

/* 5.Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
(Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra). */
select KhachHang.IDKhachHang, KhachHang.HoTen, LoaiKhach.TenLoaiKhach, HopDong.IDHopDong, 
	DichVu.TenDichVu, HopDong.NgayLamHopDong, HopDong.NgayKetThuc,
    sum(DichVu.ChiPhiThue + HopDongChiTiet.SoLuong*DichVuDiKem.Gia) as 'Tong Tien Phai Thanh Toan'
	from furama_resort.KhachHang
    left join furama_resort.HopDong on KhachHang.IDKhachHang = HopDong.IDKhachHang
    left join furama_resort.DichVu on HopDong.IDDichVu = DichVu.IDDichVu
    left join furama_resort.LoaiKhach on KhachHang.IDLoaiKhach = LoaiKhach.IDLoaiKhach
    left join furama_resort.HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
    left join furama_resort.DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
    group by KhachHang.HoTen;
    
/*6.Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ 
chưa từng được Khách hàng thực hiện đặt từ (SỬA ĐỀ: TRONG???) quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).*/
select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu from DichVu 
	inner join LoaiDichVu on DichVu.IdLoaiDichVu = LoaiDichVu.IDLoaiDichVu
    where not exists (select HopDong.IDDichVu from HopDong where ( HopDong.NgayLamHopDong between '2019-01-01' and '2019-03-31')
		and DichVu.IDDichVu = HopDong.IDDichVu);

/*7.Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.*/
select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.SoNguoiToiDa, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu,HopDong.NgayLamHopDong from DichVu
    inner join HopDong on DichVu.IDDichVu = HopDong.IDDichVu
    inner join LoaiDichVu on DichVu.IDLoaiDichVu = LoaiDichVu.IDLoaiDichVu
    where exists (select HopDong.IDHopDong from HopDong where year(HopDong.NgayLamHopDong) = '2018' and DichVu.IDDichVu = HopDong.IDDichVu )
    and not exists (select HopDong.IDHopDong from HopDong where year(HopDong.NgayLamHopDong) = '2019' and DichVu.IDDichVu = HopDong.IDDichVu );
    
/*8.Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên*/
-- Cách 1:
select KhachHang.HoTen from KhachHang
	group by KhachHang.HoTen;
-- Cách 2:
select distinct KhachHang.HoTen from KhachHang;
-- Cách 3:
select KhachHang.HoTen from KhachHang union select KhachHang.HoTen from KhachHang;

-- task 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
-- cách 1:
select temp.Thang,
count(HopDong.NgayKetThuc) as SoBooking, sum(HopDong.TongTien) as DoanhThu
	from (select 1 as Thang
	union select 2 as Thang
	union select 3 as Thang
	union select 4 as Thang
	union select 5 as Thang
	union select 6 as Thang
	union select 7 as Thang
	union select 8 as Thang
	union select 9 as Thang
	union select 10 as Thang
	union select 11 as Thang
	union select 12 as Thang ) as temp
		join HopDong on temp.Thang = month(HopDong.NgayKetThuc)
		where year(HopDong.NgayKetThuc) = 2019 or month(HopDong.NgayKetThuc) is null or year(HopDong.NgayKetThuc) is null
		group by temp.Thang
		order by temp.Thang;
        
-- cách 2:
select month(HopDong.NgayKetThuc) as Thang, count(HopDong.IDHopDong) as SoBooking, sum(HopDong.TongTien) as DoanhThu
from hopdong
	where year(HopDong.NgayKetThuc) = 2019 or month(HopDong.NgayKetThuc) is null or year(HopDong.NgayKetThuc) is null
	group by month(HopDong.NgayKetThuc)
	order by month(HopDong.NgayKetThuc);
        
/* 10.Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
(được tính dựa trên việc count các IDHopDongChiTiet). */
select HopDong.IDHopDong,HopDong.NgayLamHopDong,HopDong.NgayKetthuc,HopDong.TienDatCoc,
count(HopDongChiTiet.IDDichVuDiKem) as SoLuongDichVuDiKem from HopDong
	join DichVu on HopDong.IDDichVu = DichVu.IDDichVu
	join HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
	join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
    group by HopDong.IDHopDong;
    
/*11.Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” 
và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.*/
select DichVuDiKem.TenDichVuDiKem,KhachHang.IDKhachHang,KhachHang.HoTen,KhachHang.DiaChi,LoaiKhach.TenLoaiKhach from DichVuDiKem
    join HopDongChiTiet on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
	join HopDong on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
	join KhachHang on KhachHang.IDKhachHang = HopDong.IDHopDong
    join LoaiKhach on KhachHang.IDLoaiKhach = LoaiKhach.IDLoaiKhach
    where KhachHang.IDLoaiKhach = 1 and KhachHang.DiaChi in ('Quang Ngai','Vinh')
    group by KhachHang.HoTen;
    
/*12.Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
(được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng 
đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.*/ 
-- between '2019-10-01' and '2019-12-31'
select HopDong.IDHopDong, NhanVien.HoTen as TenNhanVien, KhachHang.HoTen as TenKhachHang, KhachHang.SoDienThoai as SoDienThoaiKhachHang, DichVu.TenDichVu,
	count(HopDongChiTiet.IDDichVuDiKem) as SoLuongDichVuDiKem,HopDong.TienDatCoc,HopDong.NgayLamHopDong as test from HopDong 
    join KhachHang on KhachHang.IDKhachHang = HopDong.IDKhachHang
    join NhanVien on NhanVien.IDNhanVien = HopDong.IDNhanVien
    join DichVu on DichVu.IDDichVu = HopDong.IDDichVu
    join HopDongChiTiet on HopDongChiTiet.IDHopDong = HopDong.IDHopDong
    where HopDong.NgayLamHopDong between '2019-10-01' and '2019-12-31'
		and not exists(select HopDong.IDHopDong from HopDong where HopDong.NgayLamHopDong between 2019-01-01 and 2019-06-30)
    group by HopDong.IDHopDong;
    
/*13.Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
(Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).*/
create temporary table temp1
	select DichVuDiKem.TenDichVuDiKem as DichVuDiKem,count(HopDongChiTiet.IDDichVuDiKem) as SoLanSuDung from DichVuDiKem
	inner join HopDongChiTiet on DichVuDiKem.IdDichVuDiKem = HopDongChiTiet.IdDichVuDiKem
    group by DichVuDiKem.TenDichVuDiKem
    order by count(HopDongChiTiet.IDDichVuDiKem) desc;
select * from temp1;

create temporary table findMax
	select temp1.DichVuDiKem,max(temp1.SoLanSuDung) as SoLanSuDungDichVuNhieuNhat from temp1;
select * from findMax;
    
drop temporary table temp1;
drop temporary table findMax;
        
/*14.Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.*/
select HopDong.IDHopDong, DichVu.TenDichVu,LoaiDichVu.TenLoaiDichVu,DichVuDiKem.TenDichVuDiKem,
	count(HopDongChiTiet.IDDichVuDiKem) as SoLanSuDung from HopDong 
    inner join DichVu on DichVu.IDDichVu = HopDong.IDDichVu
    inner join HopDongChiTiet on HopDongChiTiet.IDHopDong = HopDong.IDHopDong
    inner join DichVuDiKem on DichVuDiKem.IdDichVuDiKem = HopDongChiTiet.IDDichVuDiKem
    inner join LoaiDichVu on LoaiDichVu.IDLoaiDichVu = DichVu.IDLoaiDichVu
    group by HopDongChiTiet.IDDichVuDiKem
    having count(HopDongChiTiet.IDDichVuDiKem) = 1;
    
/*15.Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.*/
select NhanVien.IDNhanVien,NhanVien.HoTen,NhanVien.IDTrinhDo,NhanVien.IDBoPhan,NhanVien.SoDienThoai,NhanVien.DiaChi,count(HopDong.IDNhanVien) as So_Lan_Lap_Hop_Dong_2018_2019 from NhanVien 
	inner join HopDong on HopDong.IDNhanVien = NhanVien.IDNhanVien
    where HopDong.NgayLamHopDong between '2018-01-01' and '2019-12-31'
	group by HopDong.IDNhanVien
	having count(HopDong.IDNhanVien) <= 3;
    
-- 16.Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
delete from NhanVien
	where NhanVien.IDBoPhan = 1 
		and exists(select HopDong.IDNhanVien from HopDong having count(HopDong.IDNhanVien) = 0);
        
/*17.Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.(fix: 150.000.000)*/
create temporary table TongTienThanhToan_temp
	select KhachHang.IDKhachHang,KhachHang.HoTen,KhachHang.IDLoaiKhach,sum(DichVu.ChiPhiThue + HopDongChiTiet.SoLuong*DichVuDiKem.Gia) as 'tong_tien_thanh_toan' from KhachHang
		inner join HopDong on HopDong.IDKhachHang = KhachHang.IDKhachHang
		inner join DichVu on HopDong.IDDichVu = DichVu.IDDichVu
		inner join LoaiKhach on KhachHang.IDLoaiKhach = LoaiKhach.IDLoaiKhach
		inner join HopDongChiTiet on HopDong.IDHopDong = HopDongChiTiet.IDHopDong
		inner join DichVuDiKem on HopDongChiTiet.IDDichVuDiKem = DichVuDiKem.IDDichVuDiKem
			group by KhachHang.IDKhachHang;
select * from TongTienThanhToan_temp;
	
update KhachHang set KhachHang.IDLoaiKhach = 1
	where exists(select TongTienThanhToan_temp.IDKhachHang from TongTienThanhToan_temp where TongTienThanhToan_temp.tong_tien_thanh_toan > 400000000
    and KhachHang.IDLoaiKhach = 2);

drop temporary table TongTienThanhToan_temp;




    

