import {CustomerType} from './customer-type';

export interface Customer {
  id?: number;
  hoTen?: string;
  maKh?: string;
  ngaySinh?: string;
  gioiTinh?: string;
  soCMND?: string;
  soDienThoai?: string;
  email?: string;
  loaiKhach?: CustomerType;
  diaChi?: string;
}
