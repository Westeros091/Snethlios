use master
go

drop database Snethlios

-- create database Snethlios
create database Snethlios
go
use Snethlios
go

-- create CHUCVU
create table CHUCVU
(
	MACV varchar(10) primary key,
	TENCV nvarchar(30) not null,
	NHIEMVU nvarchar(50) not null
)
go
--create table NHANVIEN
create table NHANVIEN
(
	MANV int identity(1,1) primary key,
	HOTEN nvarchar(50) not null,
	MATKHAU varchar(50) not null,
	HINH nvarchar(20) not null,
	MACV varchar(10) references CHUCVU(MACV)
)
go
--create table NHACUNGCAP
create table NHACUNGCAP
(
	MANCC varchar(30) primary key,
	TENNCC nvarchar(30) not null,
	DIACHI nvarchar(50) not null,
	SDT varchar(10) not null,
	GHICHU nvarchar(50) not null
)
go
--create table PHIEUNHAP
create table PHIEUNHAP
(
	MAPN int identity(1, 1) primary key,
	NGAYNHAP date not null,
	HINHTHUCTHANHTOAN nvarchar(30) not null,
	MANV int references NHANVIEN(MANV),
	MANCC varchar(30) references NHACUNGCAP(MANCC)
)
go
--create table SANPHAM
create table SANPHAM
(
	MASP varchar(20) primary key,
	TENSP nvarchar(50) not null,
	KICHTHUOC int not null,
	LOAI nvarchar(50) not null,
	HANG nvarchar(40) not null,
	MAUSAC nvarchar(15) not null,
	MAPN int references PHIEUNHAP(MAPN)
)
go
--create table KHACHHANG
create table KHACHHANG
(
	MAKH nvarchar(50) primary key,
	TENKH nvarchar(50) not null,
	DIACHI nvarchar(40) not null,
	SDT varchar(10) not null,
	GIOITINH bit not null,
	GHICHU nvarchar(50) not null
)
go
--create table PHIEUXUAT(HOADON)
create table PHIEUXUAT
(
	SOPX int identity(1, 1) primary key,
	NGAYTAO date not null,
	LYDOHUY nvarchar(100) not null,
	TRANGTHAI nvarchar(100) not null,
	MANV int references NHANVIEN(MANV),
	MAKH nvarchar(50) references KHACHHANG(MAKH)
)
go
--create table CTPX
create table CTPX
(
	SOPX int references PHIEUXUAT(SOPX),
	MASP varchar(20) references SANPHAM(MASP),
	GIABAN float not null,
	SOLUONG int
	CONSTRAINT CT PRIMARY KEY (SOPX, MASP)
)
go
--create table THANHVIEN
create table THANHVIEN
(
	MATV varchar(30) primary key,
	DIEM int not null,
	NGAYTAO date not null,
	NGAYHETHAN date not null,
	MAKH nvarchar(50) references KHACHHANG(MAKH)
)
go

--insert chucvu
select * from Chucvu
insert into dbo.ChucVu values ('TV001',N'Tư vấn',N'Tư vấn bán hàng')
insert into dbo.ChucVu values ('TN002',N'Thu ngân',N'Thanh toán tiền sản phẩm')
insert into dbo.ChucVu values ('TV003',N'Tư vấn',N'Tư vấn kích cỡ')
insert into dbo.ChucVu values ('KK006',N'Kiểm Khoi',N'Kiểm tra số lượng sản phẩm kho')
insert into dbo.ChucVu values ('NV007',N'Nhân viên',N'Quản lý ngân sách công ty')
insert into dbo.ChucVu values ('QLK01',N'Quản lý kho',N'Chịu trách nhiệm kho hàng')
insert into dbo.ChucVu values ('BV009',N'Bảo vệ',N'BẢo vệ tư trang khách hàng và cửa hàng')
insert into dbo.ChucVu values ('CHT010',N'Cửa hàng trưởng',N'Quản lý toàn bộ cửa hàng và kho')
--insert nhanvien
select * from NhanVien
insert into NhanVien values(N'Nguyễn Văn Hải', CONVERT(varchar(32), HashBytes('MD5', 'songlong'), 2), 'hinh1.png','TV001')
insert into NhanVien values(N'Nguyễn Anh Thái', CONVERT(varchar(32), HashBytes('MD5', 'thaianhnguyen'), 2), 'hinh2.png','KK006')
insert into NhanVien values(N'Nguyễn Đức Cường', CONVERT(varchar(32), HashBytes('MD5', 'thukhoaly'), 2), 'hinh3.png','QLK01')
insert into NhanVien values(N'Nguyễn Văn Hải', CONVERT(varchar(32), HashBytes('MD5', 'matdaymonhon'), 2), 'hinh4.png','CHT010')
insert into NhanVien values(N'Trần Xuân Quỳnh', CONVERT(varchar(32), HashBytes('MD5', 'quynhchuppy'), 2), 'hinh5.png','TN002')
insert into NhanVien values(N'TLê Thái Hậu', CONVERT(varchar(32), HashBytes('MD5', 'haudamdang'), 2), 'hinh6.png','TV003')
insert into NhanVien values(N'Nguyễn Lê Hải Xuân', CONVERT(varchar(32), HashBytes('MD5', 'xuanbaove'), 2), 'hinh7.png','BV009')
insert into NhanVien values(N'Lê Văn Hải', CONVERT(varchar(32), HashBytes('MD5', 'haikiemkho'), 2), 'hinh8.png','NV007')
--insert nhacungcap
select*From NhaCungCap
insert into NhaCungCap values('CHN1',N'Quảng Châu',N'Kho Tứ Xuyên, thành phố Tô Châu, tỉnh Quảng Nam','8135526552',N'28-3-2022')
insert into NhaCungCap values('KH1',N'Khách hàng',N'2210/68 quốc lộ 1A,quận 12 TPHCM','0383955778',N'Adid 39,40')
insert into NhaCungCap values('TH1',N'Thái Lan','Bangkok capital','51955255',N'9-11-2022')
insert into NhaCungCap values('KH2',N'Store Giày SDK',N'241/2 Tân Kỳ Tân Quý,Tân Phú HCM','8135526552',N'28-3-2022')
--delete from NhaCungCap
--insert phieunhap(hoan`)
select*from PhieuNhap
insert into PhieuNhap values ('2022-03-28',N'Chuyển khoản',5,'CHN1')
insert into PhieuNhap values ('2022-02-10',N'Chuyển khoản',5,'KH1')
insert into PhieuNhap values ('2023-04-28',N'Chuyển khoản',4,'CHN1')
insert into PhieuNhap values ('2022-01-30',N'Chuyển khoản',5,'TH1')
insert into PhieuNhap values ('2022-08-30',N'Chuyển khoản',4,'KH2')
insert into PhieuNhap values ('2022-11-9',N'Tiền mặt',4,'KH2')
--sanpham
select*From SanPham
insert into Sanpham values ('AD1',N'Giày Adidas','39',N'Giày thể thao','Adidas',N'Đen',1)
insert into SanPham values ('NK1',N'Giày Nike','39',N'Giày thể thao','Nike',N'Trắng',2)
insert into SanPham values ('PM1',N'Giày Puma','39',N'Giày lười','Puma',N'Trắng',3)
insert into SanPham values ('Vs1',N'Giày Vans','39',N'Giày thể thao','Vans',N'Trắng',4)
insert into SanPham values ('JD1',N'Giày Jordan','39',N'Giày cổ cao','Jordan',N'Trắng',5)
insert into SanPham values ('GC1',N'Giày Gucci','39',N'Giày thể thao','Gucci',N'Đen',6)
--insert khachhang
select*from KhachHang
insert into KhachHang values ('KH001',N'Lê Văn Quý',N'1660/48A Lê Hồng Phong,quận 2 TPHCM','0383099555',0,N'Giao vào buổi chiều')
insert into KhachHang values ('KH002',N'Nguyễn Xuân Quy',N'2210/68 quốc lộ 1A,quận 12 TPHCM','0353095455',1,N'Giao buổi sáng')
insert into KhachHang values ('KH003',N'Trần Quốc Kỳ',N'2310 Nguyễn Oanh,quận Gò Vấp TPHCM','0383255625',0,N'Gọi trước 30 phút')
insert into KhachHang values ('KH004',N'Lê Đặng Trung Anh',N'2356/12 Lê Đức Thọ,quận Gò Vấp TPHCM','0393233451',0,N'Giao sau chiều')
insert into KhachHang values ('KH005',N'Nguyễn Thị Xuân',N'126/12 Lê Lữ, quận Tân Phú TPHCM','0384757576',0,N'Giao vào buổi sáng và gọi trước 15p')
insert into KhachHang values ('KH006',N'Nguyễn Ngọc Bảo Anh',N'2360/24A Tân Kỳ Tân Quý,Tân Phú HCM','0389485554',0,N'Đường khó vào nên gọi để anh khách rước')
--insert phieuxuat(hoan`)
select*From PhieuXuat
insert into PHIEUXUAT values('2022-9-15',N'Không',N'Đã giao',3,'KH002')
insert into PHIEUXUAT values('2022-10-15',N'Giày thưa chỉ',N'Đã hoàn trả',3,'KH005')
insert into PHIEUXUAT values('2022-1-30',N'Không',N'Đang giao hàng',8,'KH004')
insert into PHIEUXUAT values('2022-9-30',N'Hoàn trả tiền giày',N'Đã giao',3,'KH006')
insert into PHIEUXUAT values('2022-9-15',N'không',N'Đang giao',3,'KH003')
insert into PHIEUXUAT values('2022-9-15',N'Lỗi thanh toán đơn hàng',N'Đã hủy',3,'KH001')
--CTPX
select * from CTPX
insert into CTPX values (1,'AD1',350.00,1)
insert into CTPX values (2,'NK1',420.00,5)
insert into CTPX values (3,'PM1',570.00,3)
insert into CTPX values (4,'Vs1',120.00,2)
insert into CTPX values (5,'JD1',390.00,1)
insert into CTPX values (6,'GC1',250.00,1)

--thanhvien
select * from ThanhVien
insert into ThanhVien values('TV01',2,'2022-9-11','2023-9-11','KH003')
insert into ThanhVien values('TV02',4,'2022-6-12','2023-6-12','KH004')
insert into ThanhVien values('TV03',8,'2022-10-11','2023-10-11','KH001')
insert into ThanhVien values('TV04',1,'2022-3-20','2023-3-20','KH006')
